package genetic;
import java.util.ArrayList;
class Thought390 extends Thought{
private static ArrayList<Thought390> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 395.85679376293916;
private double fd1 = 483.3541780894508;
private Thought fo0 = null;
private Thought fo1 = null;
Thought390 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought390 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought390 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought390 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought390 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought390 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought390 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought390 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought390 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought390 instance = new Thought390 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought390 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought390 instance = new Thought390 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought390 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought390 instance = new Thought390 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought390 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought390 instance = new Thought390 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought390 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought390 instance = new Thought390 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought390 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought390 instance = new Thought390 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought390 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought390 instance = new Thought390 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought390 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought390 instance = new Thought390 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4();
}
    lb0 = !fb0;
    fd1 = fd0 + fd1;
    fb1 = fd0 > fd1;
    double ld1 = 131.61641953767617;
    ld1 *= -1;
    fd0 = fd1 - ld1;
if(fo0 != null){
      lb0 = fo0.m2(fb0, fb1, lb0, fb0);
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
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
    ab4 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo1.m1();
}
    fb0 = fd0 > fd1;

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
if(fo0 != null){
      fb1 = fo0.m2(fb0, fb1, fb0, fb1);
}
    ad1 *= -1;
    fb0 = ad2 > ad3;
    fb1 = fb0 || fb1;
    double ld0 = 186.24370238360174;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    ld0 = ad1 + ad2;
    Output.points[8][7] += ad3;
    double ld1 = 71.11727783970119;
    Thought lo2 = Thought15.getInstance(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
    boolean lb3 = true;
    fb0 = fb1 && lb3;
    ld0 *= -1;

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
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo0 = Thought175.getInstance(fd0, fd1, ad1, ad2);
    boolean lb1 = true;
    ad3 *= -1;
    fb0 = fb1 || lb1;
    ab1 = ad4 > fd0;
    fd1 = ad1 - ad2;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
    Thought lo2 = Thought47.getInstance();
    boolean lb3 = false;
if(fo1 != null){
      ad2 = fo1.m3(ab1, ab2, ab3, ab4);
}
    Output.points[8][8] += ad3;
    fb0 = fb1 && lb1;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, lb3, ab1, ab2, ab3);
}
    ad3 = ad4 + fd0;
    fd1 *= -1;
    ab4 = ad1 < ad2;
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ad1, fb0, fb1, lb1, lb3);
}
    ab1 = ab2 || ab3;
    boolean lb4 = true;
    Thought lo5 = Thought158.getInstance(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
    Output.points[0][0] -= ad2;
    for(int i0=0; i0<10; i0++){
        lb1 = ad3 > ad4;
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
    for(int i0=0; i0<10; i0++){
        boolean lb0 = true;
        fb0 = fd1 > fd0;
        Thought lo1 = Thought323.getInstance(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
        }
    fb0 = fb1 || fb0;
    boolean lb2 = true;
    fb0 = fb1 && lb2;
    fb0 = fd1 > fd0;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      ao4.m3(fb1, lb2, fb0, fb1);
}
    double ld3 = 374.8872279900167;
    lb2 = !fb0;
    boolean lb4 = false;
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, ld3, fd0, fb1, lb2, lb4, fb0);
}
    fb1 = lb2 && lb4;
    Thought lo5 = Thought334.getInstance(fd1, ld3, fd0, fd1, fb0, fb1, lb2, lb4);
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, fb1, lb2, lb4, fb0);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1);
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
      ao2.m2(ad1, ad2, ad3, ad4);
}
    boolean lb0 = true;
    fb0 = fb1 || lb0;
    fd0 = fd1 - ad1;
if(ao3 != null){
      ad2 = ao3.m3(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
    ad1 = ad2 + ad3;
if(ao2 != null){
      ao2.m3();
}
    fb0 = ad4 > fd0;
if(ao3 != null){
      fb1 = ao3.m2(lb0, fb0, fb1, lb0);
}
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
}
    boolean lb1 = false;
    Output.points[0][1] += fd0;
    fb0 = fb1 && lb0;
    boolean lb2 = false;
if(ao4 != null){
      ao3 = ao4.m4(fd1, ad1, ad2, ad3, lb1, lb2, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, lb0, lb1, lb2, fb0);
}
    fb1 = !lb0;
    Thought lo3 = Thought52.getInstance(fo0, fo1, ao1, ao2);
    ad4 = fd0 - fd1;
    if (lb1) {
        lb2 = fb0 && fb1;
if(ao4 != null){
          ao3 = ao4.m4(ad1, ad2, ad3, ad4);
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
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    fd1 *= -1;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    fd0 *= -1;
    fd1 *= -1;
if(ao1 != null){
      fo1 = ao1.m4();
}
    boolean lb0 = false;
    if (lb0) {
        ab1 = ab2 && ab3;
        ab4 = fd0 > fd1;
        Output.points[0][2] -= fd0;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(ao3 != null){
      ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, fb0, fb1, lb0, ab1);
}
    Output.points[0][3] -= fd1;
    ab2 = ab3 || ab4;
    boolean lb1 = false;
if(ao4 != null){
      ad1 = ao4.m3(ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb0);
}
    fd1 = ad1 + ad2;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, lb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
    for(int i0=0; i0<10; i0++){
        if (fb1) {
            boolean lb2 = false;
            Thought lo3 = Thought290.getInstance(ao4, fo0, fo1, ao1);
if(ao2 != null){
              ao2.m3(ad3, ad4, fd0, fd1);
}
if(ao4 != null){
              ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
            Thought lo4 = Thought6.getInstance();
if(ao3 != null){
              fd0 = ao3.m3(lb2, lb0, lb1, ab1);
}
if(ao4 != null){
              fd1 = ao4.m3(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
              ao3 = ao4.m4(fd0, fd1, ad1, ad2, fb1, lb2, lb0, lb1);
}
}}
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    if (fb1) {
        fd0 = fd1 - fd0;
        Thought lo0 = Thought244.getInstance(fo0, fo1, fo0, fo1);
        Thought lo1 = Thought101.getInstance(fd1, fd0, fd1, fd0);
        boolean lb2 = false;
        lb2 = fd1 > fd0;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
        Output.points[0][4] += fd1;
        fd0 = fd1 - fd0;
        fb0 = fb1 && lb2;
        Output.points[0][5] += fd1;
if(fo1 != null){
          fo1.m1();
}
        fb0 = fb1 || lb2;
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = fd0 > fd1;
    ab1 = ab2 && ab3;
    ab4 = fd0 > fd1;
    fb0 = fb1 || ab1;
    ab2 = ab3 && ab4;
    fb0 = fb1 || ab1;
    fd0 = fd1 + fd0;
    double ld0 = 197.42218334654783;
    fd0 = fd1 - ld0;
    ab2 = ab3 || ab4;
    Output.points[0][6] -= fd0;
    Thought lo1 = Thought140.getInstance(fd1, ld0, fd0, fd1, fb0, fb1, ab1, ab2);
        ab3 = !ab4;
    Thought lo2 = Thought379.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    Thought lo3 = Thought63.getInstance(ld0, fd0, fd1, ld0);
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
if(fo0 != null){
      fo0.m3();
}
if(fo1 != null){
      fd1 = fo1.m3(ab4, fb0, fb1, ab1);
}
    boolean lb4 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought111.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
    fd1 *= -1;
    ad1 *= -1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
    ad3 *= -1;
if(fo0 != null){
      fb0 = fo0.m2();
}
    ad4 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb1 = true;
    boolean lb2 = false;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, lb1, lb2, fb0, fb1);
}
    lb1 = ad1 > ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb3 = false;
    lb2 = ad3 > ad4;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo1.m1();
}
    ad1 = ad2 - ad3;

Thought.STACK_COUNTER++;
return lb3;
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
    Output.points[0][7] -= ad2;
    Output.points[0][8] -= ad3;
    ad4 *= -1;
    ab2 = ab3 || ab4;
    fb0 = fb1 && ab1;
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
    fd0 *= -1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb1, lb0, ab1, ab2);
}
    ab3 = !ab4;
    ad4 *= -1;
if(fo1 != null){
          fd0 = fo1.m3(fd1, ad1, ad2, ad3, fb0, fb1, lb0, ab1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    ad4 = fd0 + fd1;
    double ld1 = 508.66771285195193;
        fb1 = ld1 > ad1;
    lb0 = ab1 && ab2;
    double ld2 = 296.5169737260143;

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
    Output.points[1][0] -= fd0;
    fb0 = fb1 || fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb1 = !fb0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
    Output.points[1][1] -= fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
    double ld0 = 999.4449693269704;
    ld0 *= -1;
if(fo0 != null){
      ao4 = fo0.m4();
}
    boolean lb1 = true;
if(fo1 != null){
      fo1.m3(fb0, fb1, lb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0, fb1, lb1, fb0, fb1);
}
if(ao1 != null){
      ao1.m1(fd1, ld0, fd0, fd1, lb1, fb0, fb1, lb1);
}
if(ao2 != null){
      ld0 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, lb1, fb0);
}
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0);
}
    if (fb1) {
if(fo1 != null){
          fo1.m2(fd1, ld0, fd0, fd1);
}
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
    fb1 = !fb0;
    Thought lo0 = Thought393.getInstance(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ad1);
    fb1 = fb0 || fb1;
    boolean lb1 = false;
    ad2 *= -1;
    for(int i0=0; i0<10; i0++){
        ad3 = ad4 + fd0;
        fd1 = ad1 - ad2;
        Thought lo2 = Thought278.getInstance();
if(fo1 != null){
          fo0 = fo1.m4(lb1, fb0, fb1, lb1);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, lb1, fb0);
}
        ad1 = ad2 - ad3;
        ad4 *= -1;
        fb1 = lb1 && fb0;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    Output.points[1][2] -= fd1;
    fd0 = fd1 + fd0;
    fb0 = !fb1;
    boolean lb0 = false;
    if (lb0) {
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
        boolean lb1 = true;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        fd1 *= -1;
if(ao2 != null){
          ao2.m1(fd0, fd1, fd0, fd1);
}
        ab4 = fb0 || fb1;
}
Thought.STACK_COUNTER++;
return lb0;
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
    ad1 *= -1;
    ad2 = ad3 + ad4;
    fd0 = fd1 + ad1;
    for(int i0=0; i0<10; i0++){
        ab2 = ad2 < ad3;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
}
        Output.points[1][3] += ad2;
if(ao1 != null){
          ab3 = ao1.m2();
}
        Output.points[1][4] -= ad3;
        boolean lb0 = false;
        double ld1 = 145.0827594530483;
        Thought lo2 = Thought87.getInstance(ab3, ab4, fb0, fb1);
        Thought lo3 = Thought144.getInstance(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, lb0, ab1, ab2, ab3);
if(fo1 != null){
          ld1 = fo1.m3(ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb0);
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = !fb1;
    fb0 = fd1 > fd0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > fd0;
    if (fb0) {
        fb1 = fd1 < fd0;
        fb0 = fd1 > fd0;
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
        fb1 = fb0 || fb1;
        boolean lb0 = false;
        lb0 = fb0 && fb1;
        boolean lb1 = true;
if(fo0 != null){
          fo0.m3(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
        fd0 = fd1 - fd0;
        boolean lb2 = false;
        boolean lb3 = true;
        boolean lb4 = false;
        fd1 = fd0 - fd1;
        fd0 *= -1;
if(fo1 != null){
          fo1.m2();
}
        lb0 = lb1 || lb2;
if(fo1 != null){
          fo0 = fo1.m4(lb3, lb4, fb0, fb1);
}
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, lb1, lb2, lb3);
}
if(fo1 != null){
          fd1 = fo1.m3(fd0, fd1, fd0, fd1, lb4, fb0, fb1, lb0);
}
        boolean lb5 = true;
if(fo0 != null){
          lb1 = fo0.m2(fo1, fo0, fo1, fo0, lb2, lb3, lb4, lb5);
}
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
}
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0);
}
    ab2 = ab3 && ab4;
    fb0 = fb1 && ab1;
    ab2 = fd1 > fd0;
        fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd1 = fd0 - fd1;
    double ld0 = 988.2861053524282;
if(fo1 != null){
      ld0 = fo1.m3(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, ab1, ab2, ab3, ab4);
}
    fd1 *= -1;
    Output.points[1][5] -= ld0;
if(fo0 != null){
      fo0.m2(fd0, fd1, ld0, fd0, fb0, fb1, ab1, ab2);
}
    Thought lo1 = Thought321.getInstance(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
    Thought lo2 = Thought196.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, fd0, fd1);
}
    Output.points[1][6] += ld0;
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
    ab2 = fd1 > ld0;
    fd0 = fd1 - ld0;
    ab3 = ab4 && fb0;
if(fo0 != null){
      fd0 = fo0.m3();
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
    ad1 = ad2 - ad3;
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought45.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
    for(int i0=0; i0<10; i0++){
        fb0 = ad2 < ad3;
        fb1 = fb0 && fb1;
        Thought lo1 = Thought91.getInstance(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
        ad2 = ad3 + ad4;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        fd0 *= -1;
        Output.points[1][7] -= fd1;
        ad1 = ad2 + ad3;
if(fo0 != null){
          fb0 = fo0.m2(ad4, fd0, fd1, ad1);
}
        boolean lb2 = true;
        fb0 = ad2 > ad3;
        Thought lo3 = Thought67.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
if(fo1 != null){
          fb1 = fo1.m2();
}
        lb2 = fb0 || fb1;
if(fo1 != null){
          fo0 = fo1.m4(lb2, fb0, fb1, lb2);
}
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
    Thought lo0 = Thought64.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
if(fo0 != null){
      fd0 = fo0.m3(fd1, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
}
    ad4 *= -1;
    Output.points[1][8] -= fd0;
    ab4 = fb0 || fb1;
    ab1 = fd1 > ad1;
    boolean lb1 = true;
    Thought lo2 = Thought148.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
    fb0 = ad2 > ad3;
    fb1 = !lb1;
    double ld3 = 16.168323331178566;

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
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    fb1 = fd0 < fd1;
    fd0 = fd1 - fd0;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    fb0 = !fb1;
    Thought lo0 = Thought382.getInstance();
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
if(ao4 != null){
      lb1 = ao4.m2(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb0, fb1, lb1, fb0);
}
if(ao3 != null){
      fd1 = ao3.m3(fd0, fd1, fd0, fd1, fb1, lb1, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb1, fb0, fb1, lb1);
}
    fb0 = fd0 < fd1;
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2);
}
    fd0 = fd1 - fd0;

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
    Output.points[2][0] += ad1;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
    fb0 = fb1 && fb0;
    fb1 = fd1 > ad1;
    Output.points[2][1] += ad2;
if(ao3 != null){
      ad3 = ao3.m3(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
}
    Output.points[2][2] -= ad2;
    ad3 *= -1;
    ad4 *= -1;
    fd0 = fd1 + ad1;
    fb0 = ad2 > ad3;
    ad4 = fd0 - fd1;
if(ao2 != null){
      ad1 = ao2.m3();
}
    boolean lb0 = false;
    Thought lo1 = Thought363.getInstance(fb0, fb1, lb0, fb0);
    boolean lb2 = false;
    ad2 *= -1;
    fb0 = fb1 && lb0;
    lb2 = !fb0;
    fb1 = ad3 > ad4;
    lb0 = fd0 > fd1;
if(ao3 != null){
      ad1 = ao3.m3(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, lb2, fb0, fb1, lb0);
}
    lb2 = fd1 < ad1;
if(ao2 != null){
      ad2 = ao2.m3(ad3, ad4, fd0, fd1, fb0, fb1, lb0, lb2);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb0, lb2);
}
    Output.points[2][3] -= ad1;
    fb0 = fb1 && lb0;
    ad2 = ad3 + ad4;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1);
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
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    fd1 *= -1;
    ab2 = !ab3;
    boolean lb0 = true;
    Thought lo1 = Thought188.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
    Thought lo2 = Thought301.getInstance();
if(ao2 != null){
      ao2.m1(ab3, ab4, fb0, fb1);
}
    Thought lo3 = Thought227.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
}
    Thought lo4 = Thought339.getInstance(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      fb0 = ao1.m2(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(fb1, lb0, ab1, ab2);
}
if(fo1 != null){
          fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    lb0 = ab1 || ab2;
    ab3 = fd0 < fd1;
    Output.points[2][4] -= fd0;
    boolean lb5 = true;
    Output.points[2][5] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        ad2 = ad3 - ad4;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
if(fo1 != null){
      ab2 = fo1.m2(ao1, ao2, ao3, ao4);
}
    Thought lo0 = Thought74.getInstance(fd0, fd1, ad1, ad2);
    ab3 = !ab4;
    ad3 = ad4 + fd0;
    fb0 = fb1 || ab1;
    fd1 = ad1 - ad2;
    boolean lb1 = true;

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
    fd1 *= -1;
    fd0 *= -1;
    boolean lb0 = true;
    fb0 = !fb1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    Thought lo1 = Thought307.getInstance();
if(fo1 != null){
      fd1 = fo1.m3(lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    boolean lb2 = true;
    boolean lb3 = false;
    fd0 *= -1;
if(fo0 != null){
      lb3 = fo0.m2(fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb3, fb0, fb1, lb0);
}
    lb2 = lb3 && fb0;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    fb1 = !lb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    lb2 = fd1 > fd0;
    lb3 = fd1 > fd0;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb1 = !lb0;
    lb2 = !lb3;
    fd0 = fd1 - fd0;

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
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab2 = fd1 > fd0;
    ab3 = ab4 || fb0;
    boolean lb0 = true;
    fb0 = fb1 || lb0;
    ab1 = fd1 < fd0;
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
    Output.points[2][6] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
    fb1 = ad4 < fd0;
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    double ld1 = 598.6368646843554;
    lb0 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb2 = false;
    Thought lo3 = Thought193.getInstance(fb0, fb1, lb0, lb2);
    fb0 = fb1 && lb0;
    boolean lb4 = false;
    double ld5 = 824.7969623718691;
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ld5, lb2, lb4, fb0, fb1);
}
    ad1 *= -1;

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
    double ld0 = 767.9449941983939;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, lb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, ab1, ab2, ab3);
}
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    ab4 = ld0 < ad1;
    fb0 = ad2 < ad3;
if(fo0 != null){
      fo0.m1(ad4, fd0, fd1, ld0);
}
    fb1 = ad1 > ad2;
    boolean lb2 = false;
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    lb2 = ab1 && ab2;
    ld0 = ad1 + ad2;
    ad3 = ad4 + fd0;
    boolean lb3 = true;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb4 = true;
if(fo0 != null){
      ab1 = fo0.m2(ab2, ab3, ab4, fb0);
}
    fd1 = ld0 - ad1;

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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought88.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    for(int i0=0; i0<10; i0++){
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
        Output.points[2][7] += fd1;
        fd0 *= -1;
        fb1 = fb0 && fb1;
if(ao1 != null){
          fo1 = ao1.m4(fd1, fd0, fd1, fd0);
}
if(ao2 != null){
          fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
        fb1 = fb0 || fb1;
        Thought lo1 = Thought75.getInstance();
        fb0 = fd1 > fd0;
if(ao1 != null){
          fb1 = ao1.m2(fb0, fb1, fb0, fb1);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
        for(int i1=0; i1<10; i1++){
            Thought lo2 = Thought193.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
if(ao3 != null){
              ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
}}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    Thought lo1 = Thought378.getInstance(ao1, ao2, ao3, ao4);
    boolean lb2 = true;
    double ld3 = 107.19501271536818;
    for(int i0=0; i0<10; i0++){
        Output.points[2][8] += ad1;
if(fo1 != null){
          fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
        lb0 = lb2 && fb0;
        fb1 = !lb0;
        boolean lb4 = false;
        Thought lo5 = Thought279.getInstance(ao1, ao2, ao3, ao4, fd1, ld3, ad1, ad2);
if(fo1 != null){
          fo0 = fo1.m4();
}
if(ao1 != null){
          ad3 = ao1.m3(lb0, lb2, fb0, fb1);
}
        lb4 = !lb0;
        }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld3, fb0, fb1, lb0, lb2);
}
    Thought lo6 = Thought240.getInstance(ad1, ad2, ad3, ad4, fb0, fb1, lb0, lb2);
    fb0 = fb1 || lb0;
        if (lb2) {
        fd0 *= -1;
        fd1 = ld3 - ad1;
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, lb0, lb2);
}
if(ao1 != null){
          ao1.m1(ao2, ao3, ao4, fo0);
}
        fb0 = fb1 || lb0;
        Output.points[3][0] += ad2;
        lb2 = fb0 || fb1;
        lb0 = ad3 < ad4;
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
    ab2 = fd1 > fd0;
    Output.points[3][1] -= fd1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    double ld0 = 565.2803086463925;
    ld0 = fd0 - fd1;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0);
}
    Thought lo1 = Thought361.getInstance();
    ab3 = !ab4;
    fb0 = fb1 && ab1;
        ab2 = fd0 < fd1;
    ab3 = ld0 > fd0;
    Thought lo2 = Thought212.getInstance(ab4, fb0, fb1, ab1);
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1, ab2, ab3, ab4, fb0);
}
    boolean lb3 = false;
if(ao2 != null){
      ao1 = ao2.m4(ld0, fd0, fd1, ld0, fb0, fb1, lb3, ab1);
}
    ab2 = fd0 > fd1;
    boolean lb4 = false;

Thought.STACK_COUNTER++;
return ao3;
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
    Thought lo0 = Thought387.getInstance(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
    fb1 = ab1 || ab2;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(ad1, ad2, ad3, ad4);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
}
    ab3 = ad3 > ad4;
if(ao1 != null){
      ab4 = ao1.m2();
}
    fd0 = fd1 - ad1;
if(ao2 != null){
      ad2 = ao2.m3(fb0, fb1, ab1, ab2);
}
    ad3 = ad4 + fd0;
    ab3 = fd1 < ad1;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}
    ad4 *= -1;
    Thought lo1 = Thought180.getInstance(ao3, ao4, fo0, fo1);
    fd0 = fd1 + ad1;
if(ao1 != null){
      fb0 = ao1.m2(ad2, ad3, ad4, fd0);
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
    fd1 *= -1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought207.getInstance();
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
        fb0 = fb1 || fb0;
    fd1 *= -1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 - fd0;

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
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = !fb0;
    fb1 = fb0 || fb1;
    fb0 = fd0 > fd1;
    boolean lb0 = true;
            fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, fb0);
}
    boolean lb1 = true;
    boolean lb2 = false;
    fd1 = fd0 - fd1;
    lb2 = !fb0;
    fb1 = lb0 && lb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb2, fb0, fb1, lb0);
}
    fd0 = fd1 + fd0;
    fd1 *= -1;
        lb1 = !lb2;
    fb0 = fd0 < fd1;
    fb1 = fd0 < fd1;
if(fo1 != null){
      lb0 = fo1.m2(fd0, fd1, fd0, fd1, lb1, lb2, fb0, fb1);
}
    boolean lb3 = false;
    Thought lo4 = Thought41.getInstance(fo0, fo1, fo0, fo1, lb0, lb1, lb2, lb3);
    boolean lb5 = false;
    Output.points[3][2] += fd0;

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
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
    Output.points[3][3] += fd1;
    fb1 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = fb1 || fb0;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
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
}
