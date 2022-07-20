package genetic;
import java.util.ArrayList;
class Thought173 extends Thought{
private static ArrayList<Thought173> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 262.4269728759231;
private double fd1 = 955.1412222632032;
private Thought fo0 = null;
private Thought fo1 = null;
Thought173 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought173 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought173 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought173 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought173 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought173 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought173 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought173 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
public static Thought173 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought173 instance = new Thought173 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought173 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought173 instance = new Thought173 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought173 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought173 instance = new Thought173 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought173 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought173 instance = new Thought173 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought173 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought173 instance = new Thought173 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought173 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought173 instance = new Thought173 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought173 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought173 instance = new Thought173 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought173 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought173 instance = new Thought173 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
void m1() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
    fb1 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    lb0 = fb0 || fb1;
    boolean lb1 = true;
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    boolean lb2 = true;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    lb1 = lb2 || fb0;
    fd0 *= -1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought250.getInstance();
    Thought lo1 = Thought296.getInstance(ab1, ab2, ab3, ab4);
    double ld2 = 46.25645069458716;
    fd0 = fd1 - ld2;
    double ld3 = 753.65011203646;
    ld3 = fd0 + fd1;
    ld2 = ld3 - fd0;
    fd1 = ld2 - ld3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld2, ld3, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld2, ld3, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m1(fd0, fd1, ld2, ld3);
}
    fb0 = fb1 || ab1;
    ab2 = ab3 && ab4;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
    ad2 = ad3 + ad4;
    fb0 = fb1 && fb0;
    fb1 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    boolean lb0 = false;
if(fo1 != null){
      fo1.m2();
}
    for(int i0=0; i0<10; i0++){
        Thought lo1 = Thought108.getInstance(lb0, fb0, fb1, lb0);
        fb0 = fd0 > fd1;
        Thought lo2 = Thought266.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
if(fo0 != null){
          fd0 = fo0.m3(fd1, ad1, ad2, ad3, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
        double ld3 = 34.40729400014404;
        fb1 = ad3 > ad4;
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[2][3] -= ad2;
    ad3 = ad4 - fd0;
    ab1 = ab2 || ab3;
    Thought lo0 = Thought165.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fd1 = fo1.m3(ad1, ad2, ad3, ad4);
}
    Output.points[2][4] -= fd0;
    Thought lo1 = Thought74.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
    double ld2 = 455.9140735533951;
    ad3 = ad4 + fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fd1 = fo0.m3(ab4, fb0, fb1, ab1);
}
    ld2 = ad1 + ad2;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    Output.points[2][5] += fd0;
if(ao1 != null){
      ao1.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    boolean lb0 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0);
}
    Thought lo1 = Thought333.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(ao3 != null){
      ao2 = ao3.m4();
}
    double ld1 = 890.2534953226226;
    ad1 = ad2 - ad3;
    boolean lb2 = false;
if(fo0 != null){
      ao4 = fo0.m4(lb2, fb0, fb1, lb0);
}
    lb2 = fb0 && fb1;
    ad4 = fd0 + fd1;
    Thought lo3 = Thought254.getInstance(fo1, ao1, ao2, ao3, ld1, ad1, ad2, ad3, lb0, lb2, fb0, fb1);
    ad4 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ld1, ad1, lb0, lb2, fb0, fb1);
}
    Output.points[2][6] -= ad2;
if(fo1 != null){
      lb0 = fo1.m2(ao1, ao2, ao3, ao4, lb2, fb0, fb1, lb0);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    boolean lb0 = false;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
    boolean lb1 = false;
    fd1 *= -1;
if(ao3 != null){
      lb1 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    ab1 = ab2 || ab3;
    boolean lb2 = true;
    Output.points[2][7] -= fd0;
    Output.points[2][8] -= fd1;
    fd0 = fd1 - fd0;
    boolean lb3 = false;
    Thought lo4 = Thought101.getInstance(ab2, ab3, ab4, fb0);
    boolean lb5 = false;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
if(ao4 != null){
      lb2 = ao4.m2(fd1, fd0, fd1, fd0, lb3, lb5, ab1, ab2);
}
    ab3 = ab4 || fb0;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    ad2 = ad3 + ad4;
    fb0 = fb1 && ab1;
    fd0 *= -1;
    fd1 = ad1 + ad2;
    boolean lb0 = true;
    Thought lo1 = Thought223.getInstance(ao1, ao2, ao3, ao4);
if(fo0 != null){
      ab1 = fo0.m2(ad3, ad4, fd0, fd1);
}
    ad1 *= -1;
    boolean lb2 = false;
    boolean lb3 = false;
    double ld4 = 543.9777405286078;
    ad1 *= -1;
if(fo1 != null){
      lb3 = fo1.m2(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0);
}
    double ld5 = 307.6668397157937;
    ab1 = ab2 && ab3;
    ab4 = fd0 < fd1;
    fb0 = ld4 < ld5;
    Thought lo6 = Thought153.getInstance();
if(fo0 != null){
      fb1 = fo0.m2(lb0, lb2, lb3, ab1);
}
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    Output.points[3][0] += fd0;
        fb1 = fd1 < ld4;
    double ld7 = 11.886905781124812;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought83.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    fb0 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1);
}
    Output.points[3][1] -= fd0;
    boolean lb1 = false;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
        double ld2 = 280.94631494082256;
        boolean lb3 = false;
if(fo0 != null){
          fo0.m1();
}
        lb1 = fd0 > fd1;
if(fo0 != null){
          fo1 = fo0.m4(fb0, fb1, lb3, lb1);
}
        fb0 = fb1 && lb3;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld2, lb1, fb0, fb1, lb3);
}
}
Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    double ld0 = 624.6213391585951;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    fd0 = fd1 + ld0;
    Thought lo1 = Thought262.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld0, fd0, fd1);
}
    ld0 *= -1;
    double ld2 = 759.2884764709154;
    Output.points[3][2] += ld2;
    fd0 *= -1;
    for(int i0=0; i0<10; i0++){
        boolean lb3 = false;
        double ld4 = 676.5187711793398;
        }
    double ld5 = 370.11974762930106;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld2);
}
    boolean lb6 = true;
if(fo1 != null){
      ab2 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
    lb6 = ld5 < fd0;
    ab1 = ab2 && ab3;
    double ld7 = 598.1563587350079;
    ab4 = fd0 > fd1;
    ld0 = ld2 + ld5;
    double ld8 = 780.1406327163313;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld7, ld8, fd0, fd1, fb0, fb1, lb6, ab1);
}
if(fo0 != null){
          ab2 = fo0.m2(ld0, ld2, ld5, ld7, ab3, ab4, fb0, fb1);
}

Thought.STACK_COUNTER++;
return lb6;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ad1 = ad2 + ad3;
    boolean lb0 = true;
    double ld1 = 714.3792171608237;
    ad3 = ad4 - fd0;
    fb0 = !fb1;
    boolean lb2 = false;
    lb0 = fd1 > ld1;
    ad1 = ad2 - ad3;
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ld1, ad1);
}
        lb2 = !fb0;
    Thought lo3 = Thought320.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
    fb1 = !lb0;
if(fo0 != null){
      lb2 = fo0.m2();
}
    Thought lo4 = Thought20.getInstance(fb0, fb1, lb0, lb2);
    fb0 = !fb1;
    double ld5 = 763.9746406156663;
    lb0 = lb2 || fb0;
    fd0 = fd1 + ld1;
if(fo1 != null){
      ld5 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, lb0, lb2, fb0);
}
if(fo0 != null){
      fo0.m2(fd0, fd1, ld1, ld5, fb1, lb0, lb2, fb0);
}
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, fb1, lb0, lb2, fb0);
}
    double ld6 = 371.42387819629766;

Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 && ab3;
    ab4 = ad2 < ad3;
    boolean lb0 = false;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    double ld1 = 434.6869035232742;
    Output.points[3][3] -= ad3;
    double ld2 = 734.8626143193821;
    ad3 *= -1;
    Thought lo3 = Thought127.getInstance(ad4, fd0, fd1, ld1);
if(fo1 != null){
      ld2 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fd0 = fo0.m3();
}
        ab4 = fd1 > ld1;
    Thought lo4 = Thought170.getInstance(fb0, fb1, lb0, ab1);
    if (ab2) {
        ab3 = !ab4;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld2, ad1, ad2, ad3, fb0, fb1, lb0, ab1);
}
}
Thought.STACK_COUNTER++;
return ab2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fb1 = ao2.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fb1 = !fb0;
    fb1 = fd1 < fd0;
    fd1 = fd0 + fd1;
    fb0 = fd0 > fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought145.getInstance(ao3, ao4, fo0, fo1);
    fb1 = !fb0;
if(ao1 != null){
      ao1.m1(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}

Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m1(fb0, fb1, fb0, fb1);
}
    fb0 = ad1 > ad2;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fb1 = ad1 > ad2;
    double ld0 = 137.52688262872928;
    Output.points[3][4] += ad2;
if(ao2 != null){
      ad3 = ao2.m3(ad4, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ld0;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(ao1 != null){
      fd0 = ao1.m3(lb1, fb0, fb1, lb1);
}
    boolean lb2 = true;
        lb2 = fd1 > ld0;
    Thought lo3 = Thought353.getInstance(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, fb0, fb1, lb1, lb2);
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ld0, ad1, fb0, fb1, lb1, lb2);
}
    fb0 = ad2 < ad3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, lb1, lb2, fb0);
}
    double ld4 = 738.9609136628151;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb1 = !lb1;
    boolean lb5 = false;
if(ao2 != null){
      lb2 = ao2.m2(ad3, ad4, fd0, fd1);
}
    ld0 = ld4 + ad1;

Thought.STACK_COUNTER++;
return lb5;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    Output.points[3][5] += fd1;
    ab1 = ab2 && ab3;
    Thought lo1 = Thought98.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
    double ld2 = 118.28482266514136;
    Thought lo3 = Thought92.getInstance();
    double ld4 = 560.0156078119179;
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, lb0);
}
    ld2 = ld4 - fd0;
    ab1 = fd1 > ld2;
    ab2 = ld4 > fd0;
    ab3 = !ab4;
        boolean lb5 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld2, ld4, fd0, ab4, fb0, fb1, lb0);
}
    fd1 = ld2 - ld4;
    lb5 = ab1 || ab2;
if(ao1 != null){
      ao1.m3(fd0, fd1, ld2, ld4, ab3, ab4, fb0, fb1);
}
    Thought lo6 = Thought394.getInstance(ao2, ao3, ao4, fo0, lb0, lb5, ab1, ab2);
    ab3 = ab4 && fb0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fb1 = !lb0;
    if (lb5) {
        fd0 = fd1 + ld2;
        Thought lo7 = Thought137.getInstance(ld4, fd0, fd1, ld2);
}
Thought.STACK_COUNTER++;
return ab1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought108.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
if(fo1 != null){
      fd1 = fo1.m3();
}
if(ao1 != null){
      ad1 = ao1.m3(ab2, ab3, ab4, fb0);
}
    fb1 = ad2 > ad3;
    boolean lb1 = true;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, lb1, ab1, ab2, ab3);
}
    ab4 = ad2 < ad3;
        Thought lo2 = Thought329.getInstance(ad4, fd0, fd1, ad1, fb0, fb1, lb1, ab1);
    boolean lb3 = false;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
}
    fb0 = ad2 > ad3;

Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    double ld0 = 429.06329666701487;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0);
}
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
    Output.points[3][6] -= fd0;
    fb0 = fb1 || fb0;
    fd1 = ld0 - fd0;
    fd1 = ld0 - fd0;
    fd1 = ld0 + fd0;
    fb1 = fb0 || fb1;
    Output.points[3][7] += fd1;
    Output.points[3][8] += ld0;
    fb0 = fd0 > fd1;
    Output.points[4][0] -= ld0;
    fb1 = fd0 > fd1;
if(fo1 != null){
      fb0 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fb1 = fb0 && fb1;
    ld0 *= -1;
    if (fb0) {
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
        boolean lb1 = true;
        if (fb0) {
            boolean lb2 = false;
            boolean lb3 = false;
}}
Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
          fd0 = fo0.m3(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fd1 *= -1;
    boolean lb0 = false;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb0);
}
    fd0 *= -1;
    if (ab1) {
        double ld1 = 15.050681682223976;
        ab2 = ab3 && ab4;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ld1, fd0);
}
        boolean lb2 = true;
        boolean lb3 = true;
        fd1 *= -1;
        boolean lb4 = false;
        boolean lb5 = true;
        boolean lb6 = false;
        double ld7 = 314.6063264953856;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, ld7, fd0, fd1);
}
if(fo0 != null){
          lb0 = fo0.m2();
}
if(fo0 != null){
          fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1, ld1, ld7, fd0, fd1, fb1, lb2, lb3, lb4);
}
        lb5 = lb6 && lb0;
        boolean lb8 = false;
if(fo0 != null){
          ld1 = fo0.m3(ld7, fd0, fd1, ld1, lb0, ab1, ab2, ab3);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb2);
}
        lb3 = ld7 < fd0;
}
Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0);
}
    fb0 = fd1 < ad1;
    boolean lb0 = false;
    double ld1 = 226.9826092886104;
    ad1 = ad2 - ad3;
    fb0 = ad4 < fd0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, ld1, ad1, ad2);
}
    for(int i0=0; i0<10; i0++){
        fb1 = lb0 || fb0;
}
Thought.STACK_COUNTER++;
return ad3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab1 = ad1 < ad2;
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought74.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
    ab4 = ad1 < ad2;
    ad3 = ad4 - fd0;
    Output.points[4][1] += fd1;
    Output.points[4][2] -= ad1;
if(fo0 != null){
      fo0.m3(ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
    fd1 = ad1 - ad2;
    ab3 = !ab4;

Thought.STACK_COUNTER++;
return ad3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
    fb1 = fb0 || fb1;
    boolean lb0 = false;
    fd1 = fd0 + fd1;
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      ao1.m3();
}
    lb0 = fd0 > fd1;
    fb0 = fd0 < fd1;

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    Thought lo1 = Thought300.getInstance(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
    fb0 = fd1 < ad1;
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0, fb1, lb0, fb0, fb1);
}
    lb0 = fb0 && fb1;
    lb0 = fd1 > ad1;
    Output.points[4][3] -= ad2;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
          fb1 = ao4.m2(ad3, ad4, fd0, fd1);
}
    ad1 = ad2 + ad3;
    Thought lo2 = Thought306.getInstance(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1);
    lb0 = ad2 > ad3;
if(ao3 != null){
      fb0 = ao3.m2();
}
    ad4 *= -1;
    fd0 = fd1 + ad1;
if(fo0 != null){
      ao4 = fo0.m4(fb1, lb0, fb0, fb1);
}
    lb0 = ad2 > ad3;
    Thought lo3 = Thought282.getInstance(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ad1, fb0, fb1, lb0, fb0);
    fb1 = !lb0;

Thought.STACK_COUNTER++;
return ad2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(ao2 != null){
      fd0 = ao2.m3(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    double ld1 = 324.51855127952797;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, lb0, ab1);
}
    boolean lb2 = false;
    Output.points[4][4] -= fd0;
    ab1 = ab2 && ab3;
    fd1 *= -1;
    ab4 = !fb0;
    ld1 = fd0 + fd1;
if(ao2 != null){
      ld1 = ao2.m3(ao3, ao4, fo0, fo1);
}
    Thought lo3 = Thought192.getInstance(fd0, fd1, ld1, fd0);
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd1, ld1, fd0, fd1);
}
    Thought lo4 = Thought270.getInstance();
if(ao1 != null){
      fo1 = ao1.m4(fb1, lb0, lb2, ab1);
}
    double ld5 = 359.67025596455085;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld1, ld5, fd0, fd1, ab2, ab3, ab4, fb0);
}
    double ld6 = 115.66158897823465;
if(ao2 != null){
      ld1 = ao2.m3(ld5, ld6, fd0, fd1, fb1, lb0, lb2, ab1);
}

Thought.STACK_COUNTER++;
return ld1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought141.getInstance(ao1, ao2, ao3, ao4, ab2, ab3, ab4, fb0);
    Output.points[4][5] -= ad2;
    double ld1 = 652.7962836159613;
    Thought lo2 = Thought157.getInstance(fo0, fo1, ao1, ao2);
    Thought lo3 = Thought148.getInstance(ad2, ad3, ad4, fd0);
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd1, ld1, ad1, ad2);
}
if(ao2 != null){
      ad3 = ao2.m3();
}
if(ao3 != null){
      ad4 = ao3.m3(fb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    ab1 = ab2 || ab3;
    boolean lb4 = false;
if(ao4 != null){
      ab3 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, ld1, ad1, ab4, fb0, fb1, lb4);
}
    Thought lo5 = Thought282.getInstance(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
    fb0 = fb1 && lb4;
    fd1 = ld1 + ad1;
    ab1 = ab2 || ab3;
    ab4 = !fb0;
    fb1 = !lb4;
if(ao3 != null){
      ad2 = ao3.m3(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
    fb0 = ad3 < ad4;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb1 = lb4 || ab1;
    fd0 = fd1 + ld1;
    boolean lb6 = false;
    ab1 = !ab2;
    ab3 = !ab4;

Thought.STACK_COUNTER++;
return ad1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[4][6] += fd0;
    Thought lo0 = Thought202.getInstance(fd1, fd0, fd1, fd0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = fd1 < fd0;
if(fo1 != null){
      fo1.m2(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    double ld1 = 983.9079182227465;
    Thought lo2 = Thought360.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0, fb0, fb1, fb0, fb1);
    fb0 = fd1 > ld1;
    if (fb1) {
        Output.points[4][7] += fd0;
}
Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        ab1 = ab2 && ab3;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo0 = Thought204.getInstance(fd1, fd0, fd1, fd0);
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    boolean lb1 = true;
        lb1 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fd0 = fo1.m3(ab1, ab2, ab3, ab4);
}
    double ld2 = 354.7787676023781;
    double ld3 = 797.804771481561;
    boolean lb4 = true;

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 || fb1;
    ad2 = ad3 + ad4;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    double ld0 = 569.0735478402081;
    ad2 *= -1;
    Thought lo1 = Thought365.getInstance(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    ad1 = ad2 - ad3;
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ld0);
}
    fb0 = ad1 < ad2;
    boolean lb3 = false;
    Output.points[4][8] += ad3;
    Thought lo4 = Thought272.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0);
    fb0 = !fb1;
    double ld5 = 735.0581274089818;
    lb2 = ld5 < ad1;
    lb3 = fb0 || fb1;
if(fo1 != null){
      ad2 = fo1.m3();
}
    boolean lb6 = true;
if(fo1 != null){
      fo0 = fo1.m4(lb2, lb3, lb6, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, lb2, lb3, lb6);
}
    fb0 = ld0 < ld5;
    ad1 = ad2 + ad3;

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 822.0279045107845;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 - ld0;
    fb0 = fb1 || ab1;
    double ld1 = 107.44641197767996;
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || lb2;
    ab1 = !ab2;
    ab3 = ld1 > ad1;
    ad2 = ad3 - ad4;
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo0.m2(ld0, ld1, ad1, ad2);
}
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0);
}
    fb1 = !lb2;
    Output.points[5][0] += ld1;
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ad4 = fd0 - fd1;
    double ld3 = 86.90119162625365;
    ld0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ld1, ld3, ad1, ad2, fb1, lb2, ab1, ab2);
}
        ab3 = ab4 && fb0;
    fb1 = lb2 && ab1;
    Thought lo4 = Thought4.getInstance(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb2, ab1, ab2);
}

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    fb0 = !fb1;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0);
}
    lb0 = fb0 || fb1;
    lb0 = fb0 && fb1;
if(fo1 != null){
      lb0 = fo1.m2(fd1, fd0, fd1, fd0);
}
    Output.points[5][1] -= fd1;
    fd0 = fd1 + fd0;
    fb0 = !fb1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      fd1 = ao1.m3();
}
if(ao2 != null){
      ao2.m1(lb0, fb0, fb1, lb0);
}
    fb0 = !fb1;
    boolean lb1 = false;
    Thought lo2 = Thought252.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, lb0, lb1, fb0, fb1);
    fd0 = fd1 + fd0;
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1, lb0, lb1, fb0, fb1);
}
    Thought lo3 = Thought107.getInstance(ao2, ao3, ao4, fo0, lb0, lb1, fb0, fb1);
    lb0 = fd0 < fd1;
    lb1 = fd0 < fd1;
    fb0 = !fb1;
    lb0 = lb1 && fb0;
    fb1 = !lb0;
    lb1 = !fb0;

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
    Thought lo0 = Thought317.getInstance(ao1, ao2, ao3, ao4);
    Output.points[5][2] += ad4;
    boolean lb1 = true;
    double ld2 = 310.82389542885636;
    boolean lb3 = true;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld2);
}
    ad1 = ad2 - ad3;
    lb3 = fb0 && fb1;
    double ld4 = 27.90140850833434;
    Thought lo5 = Thought330.getInstance(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);
        lb1 = ld2 < ld4;
    if (lb3) {
if(fo0 != null){
          ad1 = fo0.m3();
}
}
Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ao1 = ao2.m4(ab1, ab2, ab3, ab4);
}
        fb0 = fd1 > fd0;
        Thought lo0 = Thought44.getInstance(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
        ab4 = fd1 < fd0;
        fb0 = fd1 > fd0;
        Output.points[5][3] -= fd1;
        Output.points[5][4] += fd0;
if(ao2 != null){
          ao1 = ao2.m4(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
        if (ab4) {
if(ao3 != null){
              fb0 = ao3.m2(ao4, fo0, fo1, ao1, fb1, ab1, ab2, ab3);
}
            ab4 = fb0 || fb1;
if(ao3 != null){
              ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
            boolean lb1 = false;
            fd1 = fd0 + fd1;
            lb1 = fd0 < fd1;
            fd0 *= -1;
if(ao3 != null){
              ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
            boolean lb2 = false;
            boolean lb3 = false;
            double ld4 = 888.772430786334;
}}
Thought.STACK_COUNTER++;
return ao4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ad2 > ad3;
if(ao1 != null){
      ad4 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2);
}
    ab3 = ab4 && fb0;
    double ld0 = 190.74951941999012;
    Output.points[5][5] += ad2;
if(ao1 != null){
      fo1 = ao1.m4();
}
    fb1 = !ab1;
if(ao2 != null){
      ao2.m1(ab2, ab3, ab4, fb0);
}
    Thought lo1 = Thought281.getInstance(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
    ld0 = ad1 + ad2;
    ab4 = !fb0;
    ad3 = ad4 - fd0;
    Thought lo2 = Thought132.getInstance(fd1, ld0, ad1, ad2, fb1, ab1, ab2, ab3);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 && ab4;
    fb0 = ad3 < ad4;
    fd0 = fd1 - ld0;
    fb1 = !ab1;
    Thought lo3 = Thought365.getInstance(ao1, ao2, ao3, ao4);
    ab2 = !ab3;
if(fo0 != null){
      fo0.m1(ad1, ad2, ad3, ad4);
}
    boolean lb4 = true;
    Thought lo5 = Thought357.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, ld0, ad1);

Thought.STACK_COUNTER++;
return ao4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
void accept(String color) throws CountDownExc {
switch (color) {
case "e":
empty();
break;
case "own":
own();
break;
case "other":
other();
break;
default:
throw new RuntimeException("Illegal color!!!");
}
}
void empty() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought175.getInstance();
if(fo0 != null){
      fo0.m3(fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    boolean lb1 = true;
    fd0 *= -1;
    double ld2 = 751.0830193413187;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb1, fb0);
}
    fb1 = !lb1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld2, fd0);
}
    Output.points[5][6] -= fd1;
    fb0 = fb1 && lb1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld2);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
    Output.points[5][7] -= fd0;
    double ld0 = 696.7936993076643;
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld1 = 298.8107441493917;
    fb0 = fb1 && fb0;
if(fo0 != null){
      ld1 = fo0.m3(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, ld1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + ld0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    ld1 *= -1;
    fd0 = fd1 + ld0;
    fb0 = !fb1;
        fb0 = fb1 && fb0;
    boolean lb2 = false;
        fb0 = ld1 > fd0;
        boolean lb3 = true;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 187.47179463655542;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0);
}
    double ld1 = 961.8603950758203;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld1);
}
    fd0 = fd1 + ld0;
if(fo1 != null){
      fb1 = fo1.m2();
}
    Output.points[5][8] += ld1;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(lb2, fb0, fb1, lb2);
}
    fd0 = fd1 + ld0;
        Output.points[6][0] += ld1;
    Thought lo3 = Thought140.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld1, fb0, fb1, lb2, fb0);
if(fo0 != null){
      fo0.m2(fd0, fd1, ld0, ld1, fb1, lb2, fb0, fb1);
}
    lb2 = fd0 > fd1;
    ld0 = ld1 + fd0;
    double ld4 = 402.33884542306123;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb2, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld0, ld1, ld4);
}
    boolean lb5 = false;
    fd0 *= -1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
}
