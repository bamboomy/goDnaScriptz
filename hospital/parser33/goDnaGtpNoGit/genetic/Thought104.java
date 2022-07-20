package genetic;
import java.util.ArrayList;
class Thought104 extends Thought{
private static ArrayList<Thought104> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 373.4249163567334;
private double fd1 = 933.775752713602;
private Thought fo0 = null;
private Thought fo1 = null;
Thought104 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought104 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought104 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought104 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought104 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought104 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought104 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought104 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought104 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought104 instance = new Thought104 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought104 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought104 instance = new Thought104 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought104 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought104 instance = new Thought104 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought104 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought104 instance = new Thought104 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought104 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought104 instance = new Thought104 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought104 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought104 instance = new Thought104 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought104 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought104 instance = new Thought104 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought104 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought104 instance = new Thought104 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo0.m2();
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
    fb0 = fb1 && fb0;
    fb1 = !fb0;
    fb1 = fd0 < fd1;
    Thought lo0 = Thought397.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    if (lb0) {
        ab1 = fd1 > fd0;
        fd1 = fd0 - fd1;
        fd0 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
        ab2 = fd1 < fd0;
        ab3 = fd1 > fd0;
        for(int i0=0; i0<10; i0++){
            ab4 = !fb0;
            Output.points[6][7] += fd1;
            }
        boolean lb1 = true;
        Output.points[6][8] -= fd0;
        Output.points[7][0] += fd1;
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
          fb0 = fo1.m2();
}
        Output.points[7][1] += fd1;
        fb1 = fd0 < fd1;
        boolean lb2 = true;
        lb1 = fd0 > fd1;
if(fo0 != null){
          fd0 = fo0.m3(lb2, lb0, ab1, ab2);
}
        boolean lb3 = false;
        ab2 = ab3 || ab4;
        double ld4 = 621.9321387858508;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld4, fd0, fb0, fb1, lb1, lb2);
}
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[7][2] -= ad1;
    double ld0 = 352.2785156221119;
    boolean lb1 = false;
    ad1 = ad2 + ad3;
    ad4 = fd0 + fd1;
    boolean lb2 = true;
    ld0 = ad1 - ad2;
    boolean lb3 = true;
if(fo0 != null){
      fo0.m1(ad3, ad4, fd0, fd1, lb1, lb2, lb3, fb0);
}
    fb1 = ld0 > ad1;
    lb1 = ad2 > ad3;
    boolean lb4 = true;
    lb2 = lb3 && lb4;

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
    double ld0 = 537.9701200852426;
    ld0 = ad1 - ad2;
    ad3 = ad4 - fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    ld0 *= -1;
    fb0 = fb1 || ab1;
    ab2 = ab3 && ab4;
    double ld1 = 646.8575447588076;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb2 = false;

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
    Output.points[7][3] += fd1;
    fd0 *= -1;
    fb0 = fb1 && fb0;
    fb1 = fd1 < fd0;
    boolean lb0 = true;
    for(int i0=0; i0<10; i0++){
        boolean lb1 = true;
        lb1 = fd1 < fd0;
        Thought lo2 = Thought232.getInstance(fd1, fd0, fd1, fd0);
        Output.points[7][4] -= fd1;
        Output.points[7][5] -= fd0;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
        lb0 = fb0 || fb1;
if(ao1 != null){
          fd1 = ao1.m3();
}
        fd0 = fd1 + fd0;
        boolean lb3 = true;
        boolean lb4 = true;
if(ao2 != null){
          ao2.m1(lb1, lb3, lb4, lb0);
}
        fd1 *= -1;
        fd0 = fd1 + fd0;
        fd1 *= -1;
if(ao3 != null){
          ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb0, fb1, lb1, lb3);
}
        Thought lo5 = Thought181.getInstance(fd0, fd1, fd0, fd1, lb4, lb0, fb0, fb1);
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb1, lb3, lb4, lb0);
}
        Output.points[7][6] -= fd0;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
    fb1 = fb0 && fb1;
    ad2 *= -1;
    fb0 = ad3 < ad4;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ad1, ad2);
}
    ad3 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1);
}
    fb1 = !fb0;
if(ao3 != null){
      ad2 = ao3.m3();
}
if(fo0 != null){
      ao4 = fo0.m4(fb1, fb0, fb1, fb0);
}
    ad3 = ad4 - fd0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    for(int i0=0; i0<10; i0++){
        Thought lo0 = Thought180.getInstance(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
        fb1 = !fb0;
        fb1 = ad2 > ad3;
        fb0 = !fb1;
        ad4 = fd0 - fd1;
        ad1 *= -1;
if(fo1 != null){
          fb0 = fo1.m2(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
          fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
        fb1 = fb0 && fb1;
        double ld1 = 818.1577930983022;
if(ao1 != null){
          ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, ld1, ad1);
}
if(fo1 != null){
          fo1.m3();
}
if(ao1 != null){
          ad2 = ao1.m3(fb0, fb1, fb0, fb1);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
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
    double ld0 = 64.21558068801804;
    Thought lo1 = Thought167.getInstance(ld0, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
    Thought lo2 = Thought169.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, ab1, ab2);
    fd0 = fd1 - ld0;
    ab3 = ab4 || fb0;
if(fo1 != null){
      fb1 = fo1.m2(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld0, fd0, fd1);
}
    boolean lb3 = true;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld0, fd0, fd1, ld0);
}
    lb3 = ab1 && ab2;
    fd0 *= -1;
    boolean lb4 = true;
    ab2 = fd1 > ld0;
    fd0 *= -1;
    ab3 = !ab4;
    fd1 = ld0 + fd0;
if(fo1 != null){
      fo1.m2();
}
if(ao1 != null){
      fd1 = ao1.m3(fb0, fb1, lb3, lb4);
}
    Thought lo5 = Thought372.getInstance(ao2, ao3, ao4, fo0, ld0, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld0, fd0, fd1, fb0, fb1, lb3, lb4);
}
    boolean lb6 = true;

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
    Output.points[7][7] += ad1;
    ad2 *= -1;
    double ld0 = 534.3205526177612;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    ad2 *= -1;
    ad3 = ad4 + fd0;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
    fb0 = fb1 || ab1;
if(ao1 != null){
      fo1 = ao1.m4(ld0, ad1, ad2, ad3);
}
    boolean lb1 = true;
        ab1 = ab2 && ab3;
    ad4 = fd0 + fd1;
    ld0 = ad1 - ad2;
    ab4 = !fb0;
    boolean lb2 = true;
    Thought lo3 = Thought336.getInstance(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
    ld0 *= -1;
    Output.points[7][8] -= ad1;
if(fo1 != null){
      fb0 = fo1.m2();
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    fb0 = fd0 > fd1;
    boolean lb1 = false;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}
    double ld2 = 510.2982292619706;
    ld2 *= -1;
    fb0 = fb1 || lb0;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld2, fd0, lb1, fb0, fb1, lb0);
}
    boolean lb3 = false;
    double ld4 = 842.3465181984272;

Thought.STACK_COUNTER++;
return lb1;
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
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    Thought lo0 = Thought140.getInstance(fd0, fd1, fd0, fd1);
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    boolean lb1 = true;
    fd1 = fd0 - fd1;
if(fo0 != null){
      ab4 = fo0.m2();
}
    boolean lb2 = false;
    fd0 = fd1 + fd0;
    Thought lo3 = Thought110.getInstance(ab4, fb0, fb1, lb1);
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb2, ab1, ab2, ab3);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb1);
}
    lb2 = fd0 < fd1;
    ab1 = ab2 || ab3;
    double ld4 = 372.6955077666862;
    Thought lo5 = Thought385.getInstance(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb1);
    double ld6 = 348.53581608962264;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb7 = false;
    lb2 = ld4 < ld6;
    fd0 *= -1;
    Output.points[8][0] += fd1;
    double ld8 = 829.1984840073927;
    boolean lb9 = true;

Thought.STACK_COUNTER++;
return lb7;
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
    fb1 = !fb0;
    boolean lb0 = true;
    fb0 = ad1 < ad2;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
    Thought lo1 = Thought51.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
if(fo1 != null){
      fb1 = fo1.m2();
}
    double ld2 = 493.24643386675365;
    Output.points[8][1] -= ad4;
if(fo0 != null){
      lb0 = fo0.m2(fb0, fb1, lb0, fb0);
}
    fb1 = lb0 && fb0;
    boolean lb3 = false;
    fb0 = fb1 && lb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld2, ad1, lb3, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, lb3, fb0, fb1, lb0);
}
    lb3 = fb0 || fb1;
    double ld4 = 272.0009029350632;
    fd0 *= -1;
    boolean lb5 = false;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, lb0, lb3, lb5, fb0);
}
    boolean lb6 = true;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m2(fd1, ld2, ld4, ad1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld7 = 580.0078083065919;
    double ld8 = 3.24128679256932;

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
    ad2 = ad3 + ad4;
if(fo0 != null){
      fo0.m3(ab1, ab2, ab3, ab4);
}
    double ld0 = 19.60655758388513;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0, fb0, fb1, ab1, ab2);
}
    ad1 = ad2 + ad3;
    ab3 = ab4 && fb0;
    double ld1 = 305.87618790350615;
    double ld2 = 921.0992696038631;
    ad2 = ad3 - ad4;
    fb1 = ab1 || ab2;
    ab3 = fd0 > fd1;
    ab4 = ld0 > ld1;
if(fo0 != null){
      fo1 = fo0.m4(ld2, ad1, ad2, ad3, fb0, fb1, ab1, ab2);
}
    ad4 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd1 = fo0.m3(ld0, ld1, ld2, ad1);
}
    ab1 = ad2 < ad3;
    ab2 = ad4 < fd0;

Thought.STACK_COUNTER++;
return ab3;
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
    fb1 = fd0 > fd1;
    fb0 = fb1 || fb0;
    fb1 = fd0 < fd1;
    boolean lb0 = true;
    lb0 = fb0 || fb1;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      fd1 = ao1.m3();
}
    Thought lo1 = Thought324.getInstance(lb0, fb0, fb1, lb0);
    boolean lb2 = false;
    lb2 = fb0 || fb1;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, lb0, lb2, fb0, fb1);
}
if(ao1 != null){
          lb0 = ao1.m2(fd1, fd0, fd1, fd0, lb2, fb0, fb1, lb0);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, lb2, fb0, fb1, lb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    lb2 = fd1 > fd0;
if(ao1 != null){
      ao1.m2(fd1, fd0, fd1, fd0);
}
    Output.points[8][2] -= fd1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb0 = fb1 || lb0;
if(ao1 != null){
      lb2 = ao1.m2();
}
if(ao2 != null){
      fb0 = ao2.m2(fb1, lb0, lb2, fb0);
}
    Output.points[8][3] += fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb1, lb0, lb2, fb0);
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
    ad2 = ad3 - ad4;
if(ao1 != null){
          fb0 = ao1.m2(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    ad3 *= -1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(ad4, fd0, fd1, ad1);
}
    ad2 *= -1;
if(ao2 != null){
      ad3 = ao2.m3(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    fb0 = ad2 > ad3;
    boolean lb0 = false;
    Output.points[8][4] += ad4;
    fd0 = fd1 + ad1;
    Thought lo1 = Thought203.getInstance(fb0, fb1, lb0, fb0);
    boolean lb2 = true;
    fb0 = fb1 && lb0;
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ad2 = ao3.m3(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, lb2, fb0, fb1, lb0);
}
        lb2 = ad1 > ad2;
        boolean lb3 = true;
if(ao3 != null){
          ao2 = ao3.m4(ad3, ad4, fd0, fd1, lb2, fb0, fb1, lb3);
}
        boolean lb4 = true;
        lb4 = lb0 || lb2;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, lb3, lb4);
}
if(ao4 != null){
          ad1 = ao4.m3(fo0, fo1, ao1, ao2);
}
        double ld5 = 991.8103423060489;
if(ao3 != null){
          ao3.m2(ad1, ad2, ad3, ad4);
}
        boolean lb6 = false;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
        Output.points[8][5] += fd1;
        ab2 = ab3 && ab4;
        fb0 = !fb1;
        fd0 = fd1 - fd0;
        ab1 = ab2 && ab3;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
        fd1 = fd0 - fd1;
        ab4 = fd0 < fd1;
        fd0 = fd1 + fd0;
        Thought lo0 = Thought341.getInstance();
if(ao2 != null){
          fd1 = ao2.m3(fb0, fb1, ab1, ab2);
}
        Thought lo1 = Thought356.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
        fd0 *= -1;
        for(int i1=0; i1<10; i1++){
            double ld2 = 855.2870420228555;
            ab1 = fd0 > fd1;
            Output.points[8][6] += ld2;
if(ao1 != null){
              fd0 = ao1.m3(fd1, ld2, fd0, fd1, ab2, ab3, ab4, fb0);
}
            fb1 = ab1 || ab2;
if(ao2 != null){
              ao2.m1(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(ao1 != null){
              ld2 = ao1.m3(ao2, ao3, ao4, fo0);
}
            Output.points[8][7] -= fd0;
            ab1 = ab2 && ab3;
if(ao1 != null){
              fo1 = ao1.m4(fd1, ld2, fd0, fd1);
}
            double ld3 = 423.98181771954484;
if(ao2 != null){
              ld2 = ao2.m3(ao3, ao4, fo0, fo1, ld3, fd0, fd1, ld2);
}
            }
        double ld4 = 852.9846108374073;
}
Thought.STACK_COUNTER++;
return ab4;
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
    ad2 *= -1;
    ab1 = ad3 < ad4;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fd0 = fd1 + ad1;
if(ao3 != null){
      ad2 = ao3.m3(ab2, ab3, ab4, fb0);
}
    Output.points[8][8] -= ad3;
    Thought lo0 = Thought102.getInstance(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1, fb1, ab1, ab2, ab3);
    ad2 = ad3 + ad4;
if(ao2 != null){
      ab4 = ao2.m2(fd0, fd1, ad1, ad2, fb0, fb1, ab1, ab2);
}
    ad3 = ad4 + fd0;
    ab3 = fd1 > ad1;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ab4, fb0, fb1, ab1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ad2 = ao2.m3(ad3, ad4, fd0, fd1);
}
if(ao3 != null){
      ad1 = ao3.m3(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
    boolean lb1 = true;
    Output.points[0][0] += ad3;
    ab1 = ad4 < fd0;
    ab2 = ab3 && ab4;
    Thought lo2 = Thought118.getInstance();
    fb0 = !fb1;
    lb1 = !ab1;
    boolean lb3 = false;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
        boolean lb0 = false;
    double ld1 = 830.2273491930964;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1);
}
    ld1 = fd0 - fd1;
    double ld2 = 853.3970961891187;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = ld1 > ld2;
if(fo0 != null){
      fo0.m3(fb1, lb0, fb0, fb1);
}
    double ld3 = 223.62557052719114;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld3, fd0, fd1, ld1, lb0, fb0, fb1, lb0);
}

Thought.STACK_COUNTER++;
return ld2;
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
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    boolean lb0 = false;
    boolean lb1 = false;
    fd1 = fd0 - fd1;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    Thought lo3 = Thought197.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(lb0, lb1, lb2, ab1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = fd0 < fd1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, lb0, lb1, lb2, ab1);
}
    Output.points[0][1] += fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = lb0 && lb1;
    fd1 *= -1;

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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    ad4 *= -1;
    fd0 = fd1 - ad1;
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo1.m1();
}
    fb1 = fb0 && fb1;
    for(int i0=0; i0<10; i0++){
}
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
if(fo0 != null){
          ad4 = fo0.m3(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb0, fb1, ab1, ab2);
}
    double ld0 = 644.2081081482949;
if(fo0 != null){
      fo0.m3(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
    ab1 = ld0 > ad1;
    ad2 = ad3 + ad4;
    ab2 = !ab3;
    ab4 = fd0 > fd1;

Thought.STACK_COUNTER++;
return ld0;
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
    Thought lo0 = Thought307.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
    boolean lb1 = false;
    Thought lo2 = Thought108.getInstance(fo1, ao1, ao2, ao3);
    fd1 = fd0 + fd1;
    fd0 *= -1;
    lb1 = fd1 < fd0;
    for(int i0=0; i0<10; i0++){
        for(int i1=0; i1<10; i1++){
            Output.points[0][2] -= fd1;
if(fo0 != null){
              ao4 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(ao1 != null){
              fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
            fd0 = fd1 - fd0;
            double ld3 = 595.3161668589564;
            Output.points[0][3] += fd0;
            fb0 = fd1 > ld3;
            boolean lb4 = true;
            boolean lb5 = false;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought230.getInstance();
if(ao2 != null){
      fb0 = ao2.m2(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    ad3 = ad4 - fd0;
    Thought lo1 = Thought218.getInstance(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    fd1 = ad1 - ad2;
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
if(ao3 != null){
      ad3 = ao3.m3(ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
    Output.points[0][4] += ad1;
    double ld2 = 454.8384477121788;
    fb0 = ad1 > ad2;
if(ao4 != null){
      ad3 = ao4.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
if(ao1 != null){
      ad4 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, ld2, ad1, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    if (fb1) {
if(ao2 != null){
          fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
    ab2 = ab3 && ab4;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought336.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
if(fo0 != null){
      fo0.m2();
}
    fb0 = !fb1;
    boolean lb1 = false;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fd0 = fo1.m3(lb1, ab1, ab2, ab3);
}
    fd1 = fd0 + fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    Output.points[0][5] += fd0;
    fb0 = !fb1;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought304.getInstance(ao1, ao2, ao3, ao4, ab1, ab2, ab3, ab4);
    ad1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    Thought lo1 = Thought105.getInstance(ad2, ad3, ad4, fd0);
    fd1 = ad1 - ad2;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1);
}
    ad1 = ad2 - ad3;
    boolean lb2 = true;
    ab4 = fb0 || fb1;
    lb2 = ad4 > fd0;
if(ao4 != null){
      ao4.m1();
}
    ab1 = !ab2;
    Thought lo3 = Thought161.getInstance(ab3, ab4, fb0, fb1);
    Thought lo4 = Thought36.getInstance(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3, lb2, ab1, ab2, ab3);
    double ld5 = 62.46168213183864;
    if (ab4) {
        ad3 = ad4 + fd0;
if(ao4 != null){
          ao3 = ao4.m4(fd1, ld5, ad1, ad2, fb0, fb1, lb2, ab1);
}
if(fo0 != null){
          ab2 = fo0.m2(fo1, ao1, ao2, ao3, ab3, ab4, fb0, fb1);
}
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    fb0 = fb1 && fb0;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Output.points[0][6] += fd0;
    Output.points[0][7] -= fd1;
    fd0 *= -1;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fb0 = fo1.m2(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = !fb1;
    Thought lo0 = Thought361.getInstance(fb0, fb1, fb0, fb1);
    Thought lo1 = Thought379.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);

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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ab1 = fo0.m2(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = fd1 < fd0;
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = fd0 > fd1;
    double ld0 = 859.3448316568337;
    boolean lb1 = true;
if(fo1 != null){
          fo0 = fo1.m4(ld0, fd0, fd1, ld0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
if(fo0 != null){
      fo0.m2();
}
    fb0 = fd1 < ld0;
    Output.points[0][8] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb1, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, ab3, ab4, fb0, fb1);
}
    lb1 = ld0 > fd0;
    ab1 = ab2 && ab3;
    ab4 = fb0 || fb1;
    fd1 *= -1;
if(fo1 != null){
      ld0 = fo1.m3(fd0, fd1, ld0, fd0, lb1, ab1, ab2, ab3);
}
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb1);
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 || fb1;
    ad1 *= -1;
    boolean lb0 = false;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb0 = fo0.m2(ad2, ad3, ad4, fd0);
}
    Thought lo1 = Thought29.getInstance(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
    fb1 = lb0 && fb0;
    ad4 = fd0 + fd1;
    fb1 = !lb0;
    Thought lo2 = Thought364.getInstance();
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb0, fb0, fb1);
}
    lb0 = ad1 > ad2;

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
    ab2 = ad1 < ad2;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
    ad1 = ad2 - ad3;
    ad4 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
        boolean lb0 = false;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
}
    Thought lo1 = Thought180.getInstance(fo1, fo0, fo1, fo0);
    ad4 *= -1;
    ab1 = fd0 < fd1;
    ad1 = ad2 + ad3;
    double ld2 = 568.6318998051698;
    ab2 = ab3 || ab4;
    Thought lo3 = Thought200.getInstance(ad3, ad4, fd0, fd1);
    Output.points[1][0] += ld2;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fb0 = fd0 < fd1;
    fb1 = lb0 && ab1;
    ld2 = ad1 + ad2;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
    fd1 *= -1;
if(ao2 != null){
      fd0 = ao2.m3();
}
        boolean lb0 = false;
    fd1 *= -1;
    fb0 = fb1 || lb0;
if(ao3 != null){
      ao3.m3(fb0, fb1, lb0, fb0);
}
    double ld1 = 269.10788330115867;
    boolean lb2 = false;
    Output.points[1][1] += ld1;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
    ad2 = ad3 - ad4;
    boolean lb0 = false;
    fb0 = fb1 && lb0;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2, fb0, fb1, lb0, fb0);
}
if(ao1 != null){
      ad3 = ao1.m3(ad4, fd0, fd1, ad1, fb1, lb0, fb0, fb1);
}
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1, lb0, fb0, fb1, lb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      fb0 = ao1.m2(ad3, ad4, fd0, fd1);
}
    Thought lo1 = Thought225.getInstance(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
    fd0 *= -1;
    boolean lb2 = true;
    Output.points[1][2] -= fd1;
    ad1 = ad2 + ad3;
if(ao1 != null){
      fo1 = ao1.m4();
}
    double ld3 = 591.9532658822005;
    Thought lo4 = Thought100.getInstance(fb0, fb1, lb0, lb2);
    fb0 = fb1 || lb0;

Thought.STACK_COUNTER++;
return ao2;
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
    fd1 = fd0 + fd1;
    ab2 = ab3 || ab4;
    Thought lo0 = Thought98.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fb0 = fb1 || ab1;
    Thought lo1 = Thought93.getInstance(fd0, fd1, fd0, fd1);
    ab2 = ab3 && ab4;
    fd0 = fd1 + fd0;
    double ld2 = 492.14168671754015;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, ld2, fd0, fd1);
}
    fb0 = ld2 > fd0;
    boolean lb3 = true;
    fd1 = ld2 + fd0;
    boolean lb4 = false;
    ab4 = !fb0;
    fb1 = lb3 && lb4;
if(fo1 != null){
      fo1.m3();
}
    fd1 = ld2 + fd0;
if(ao2 != null){
      ao1 = ao2.m4(ab1, ab2, ab3, ab4);
}
    fd1 = ld2 - fd0;
    boolean lb5 = false;
    Thought lo6 = Thought135.getInstance(ao3, ao4, fo0, fo1, fd1, ld2, fd0, fd1, ab4, fb0, fb1, lb3);

Thought.STACK_COUNTER++;
return ao1;
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
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    if (fb1) {
if(ao4 != null){
          fd0 = ao4.m3(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}
        } else {
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
        fd1 = ad1 - ad2;
        double ld0 = 175.8837079644972;
        double ld1 = 322.05029682298215;
        Thought lo2 = Thought137.getInstance(ad1, ad2, ad3, ad4);
if(ao3 != null){
          fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, ld0, ld1, ad1);
}
}
Thought.STACK_COUNTER++;
return ao2;
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
    fb0 = fd1 > fd0;
if(fo0 != null){
      fb1 = fo0.m2();
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    Output.points[1][3] += fd0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
        boolean lb0 = false;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    double ld1 = 623.0285328747759;

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
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 + fd1;
    fb1 = fb0 || fb1;
    fd0 = fd1 - fd0;
    Thought lo0 = Thought302.getInstance(fo0, fo1, fo0, fo1);
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fb0 = fb1 || fb0;
    boolean lb1 = false;
    fb0 = fb1 || lb1;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    lb2 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 *= -1;
    fd1 = fd0 - fd1;
    Thought lo3 = Thought325.getInstance(lb1, lb2, fb0, fb1);

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
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld0 = 806.6557241719541;
    Thought lo1 = Thought92.getInstance(ld0, fd0, fd1, ld0);
    double ld2 = 758.4211633557544;
    Thought lo3 = Thought10.getInstance(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld0);
    boolean lb4 = false;
    ld2 *= -1;
    fd0 = fd1 - ld0;
    boolean lb5 = false;
    lb4 = ld2 > fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo6 = Thought80.getInstance(lb5, fb0, fb1, lb4);
    fd1 = ld0 + ld2;

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
