package genetic;
import java.util.ArrayList;
class Thought229 extends Thought{
private static ArrayList<Thought229> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 109.18941990101803;
private double fd1 = 22.846307849689765;
private Thought fo0 = null;
private Thought fo1 = null;
Thought229 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought229 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought229 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought229 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought229 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought229 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought229 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought229 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought229 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought229 instance = new Thought229 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought229 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought229 instance = new Thought229 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought229 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought229 instance = new Thought229 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought229 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought229 instance = new Thought229 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought229 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought229 instance = new Thought229 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought229 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought229 instance = new Thought229 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought229 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought229 instance = new Thought229 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought229 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought229 instance = new Thought229 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    fb0 = fb1 || fb0;
    fb1 = fd0 < fd1;
    fb0 = fd0 > fd1;
        fd0 = fd1 + fd0;
    Output.points[4][5] += fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Output.points[4][6] -= fd0;
    fd1 = fd0 - fd1;
    Output.points[4][7] += fd0;
    fb1 = fd1 < fd0;

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
    ab1 = !ab2;
    ab3 = fd1 > fd0;
    fd1 = fd0 - fd1;
    ab4 = fb0 && fb1;
if(fo1 != null){
      ab1 = fo1.m2();
}
    Thought lo0 = Thought325.getInstance(ab2, ab3, ab4, fb0);
    fb1 = fd0 < fd1;
    fd0 = fd1 - fd0;
    ab1 = fd1 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    Thought lo1 = Thought12.getInstance(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
    fd0 = fd1 + fd0;
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd1 = fd0 - fd1;
    ab1 = fd0 < fd1;
    ab2 = fd0 < fd1;
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1);
}
    ab3 = !ab4;
    Output.points[4][8] += fd0;
    fb0 = fd1 < fd0;

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
    Thought lo0 = Thought387.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
    fb0 = fd1 < ad1;
    ad2 = ad3 + ad4;
    boolean lb1 = false;
    boolean lb2 = true;
if(fo0 != null){
      lb2 = fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb1, lb2);
}
    fb0 = fb1 && lb1;
    fd0 = fd1 - ad1;
    if (lb2) {
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, lb1, lb2, fb0);
}
if(fo0 != null){
          fo0.m2(fd1, ad1, ad2, ad3, fb1, lb1, lb2, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb1, lb2, fb0);
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
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ad2 < ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
if(fo1 != null){
      ab3 = fo1.m2();
}
    ab4 = ad3 > ad4;
        fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    ad4 *= -1;

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
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < fd0;
    double ld0 = 404.1808206342147;
    Thought lo1 = Thought365.getInstance(ao3, ao4, fo0, fo1);
    boolean lb2 = false;
    boolean lb3 = true;
    Output.points[5][0] -= fd0;
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ao1 = ao2.m4(fd1, ld0, fd0, fd1);
}
        ld0 *= -1;
        lb3 = fb0 || fb1;
        lb2 = fd0 > fd1;
        lb3 = ld0 > fd0;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld0, fd0, fd1);
}
if(ao3 != null){
          ao3.m1();
}
if(fo0 != null){
          ao4 = fo0.m4(fb0, fb1, lb2, lb3);
}
        ld0 *= -1;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ld0, fd0, fb0, fb1, lb2, lb3);
}
        fb0 = fd1 > ld0;
        boolean lb4 = false;
if(fo1 != null){
          fd0 = fo1.m3(fd1, ld0, fd0, fd1, fb0, fb1, lb4, lb2);
}
        lb3 = ld0 < fd0;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, lb4, lb2);
}
if(ao1 != null){
          fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
        lb3 = ld0 > fd0;
        fd1 *= -1;
        Thought lo5 = Thought312.getInstance(ld0, fd0, fd1, ld0);
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
    fb1 = !fb0;
    double ld0 = 496.3967776149607;
    Thought lo1 = Thought239.getInstance(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
    if (fb1) {
if(fo1 != null){
          fb0 = fo1.m2();
}
        fd0 = fd1 + ld0;
        fb1 = ad1 > ad2;
if(ao2 != null){
          ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
        fb0 = ad3 < ad4;
        Output.points[5][1] += fd0;
        fd1 = ld0 + ad1;
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
        Output.points[5][2] -= fd1;
if(ao2 != null){
          ao2.m2(ld0, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
        double ld2 = 630.7413743378254;
        Thought lo3 = Thought244.getInstance(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
        boolean lb4 = false;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
        boolean lb5 = true;
        lb5 = !fb0;
if(ao2 != null){
          ao1 = ao2.m4(ad3, ad4, fd0, fd1);
}
        ld2 = ld0 + ad1;
if(ao3 != null){
          fb1 = ao3.m2(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
        boolean lb6 = false;
        boolean lb7 = false;
if(ao2 != null){
          ao2.m1();
}
        lb4 = lb5 && lb6;
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
          ao1 = ao2.m4(ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    ab4 = fd0 < fd1;
    fb0 = fd0 < fd1;
    double ld0 = 614.5079050389979;
    ld0 *= -1;
    Output.points[5][3] += fd0;
    fd1 = ld0 + fd0;
    Thought lo1 = Thought210.getInstance(fd1, ld0, fd0, fd1, fb1, ab1, ab2, ab3);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab4, fb0, fb1, ab1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    boolean lb2 = true;
    ab1 = ld0 > fd0;
if(ao2 != null){
          ao2.m3(fd1, ld0, fd0, fd1);
}
    ld0 *= -1;
    boolean lb3 = false;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0);
}
    fd1 *= -1;

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
if(ao2 != null){
      lb0 = ao2.m2();
}
    ad1 = ad2 - ad3;
    double ld1 = 482.2643159433483;
    ab1 = ad3 < ad4;
    Thought lo2 = Thought350.getInstance(ab2, ab3, ab4, fb0);
    Output.points[5][4] += fd0;
    fd1 = ld1 + ad1;
    ad2 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, fb1, lb0, ab1, ab2);
}
if(ao4 != null){
      ao3 = ao4.m4(ld1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, lb0, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3);
}
    Output.points[5][5] += ad4;
    lb0 = fd0 > fd1;

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
    fb1 = fb0 || fb1;
    fb0 = fb1 || fb0;
    Output.points[5][6] += fd0;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    lb0 = !fb0;
if(fo1 != null){
      fb1 = fo1.m2();
}
    double ld1 = 667.9919342923133;
    fd0 = fd1 - ld1;
    lb0 = fd0 < fd1;
    fb0 = ld1 > fd0;
if(fo0 != null){
      fd1 = fo0.m3(fb1, lb0, fb0, fb1);
}
    lb0 = ld1 > fd0;
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      ld1 = fo1.m3(fd0, fd1, ld1, fd0, fb0, fb1, lb0, fb0);
}
    fd1 = ld1 + fd0;
    double ld2 = 217.08949364560874;
    fd0 *= -1;
    fb1 = fd1 < ld1;
    double ld3 = 111.39937447619873;
    lb0 = ld2 > ld3;
    double ld4 = 109.00699309946704;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ld4 = fd0 + fd1;

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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    boolean lb0 = true;
    Output.points[5][7] += fd1;
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, lb0);
}
    double ld1 = 488.97753277836705;
    ab1 = ld1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(ld1, fd0, fd1, ld1, lb0, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    Thought lo2 = Thought203.getInstance(fo1, fo0, fo1, fo0, lb0, ab1, ab2, ab3);
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, fd0);
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
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = !fb0;
    if (fb1) {
        Thought lo0 = Thought205.getInstance(fb0, fb1, fb0, fb1);
        Thought lo1 = Thought322.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
        } else {
        ad3 *= -1;
if(fo1 != null){
          fb0 = fo1.m2(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          ad2 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 && fb1;
        Thought lo2 = Thought75.getInstance(fo1, fo0, fo1, fo0);
        boolean lb3 = true;
        lb3 = ad3 > ad4;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ad1, ad2);
}
        Thought lo4 = Thought124.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
        ad1 *= -1;
        fb0 = ad2 > ad3;
if(fo1 != null){
          fo1.m3();
}
if(fo1 != null){
          fo0 = fo1.m4(fb1, lb3, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, lb3, fb0, fb1, lb3);
}
if(fo0 != null){
          fb0 = fo0.m2(ad2, ad3, ad4, fd0, fb1, lb3, fb0, fb1);
}
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, lb3, fb0, fb1, lb3);
}
        fd1 *= -1;
        Thought lo5 = Thought212.getInstance(fo0, fo1, fo0, fo1);
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ab1 = fo0.m2(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    Output.points[5][8] -= ad3;
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb0 = false;
    boolean lb1 = false;
    lb1 = ab1 && ab2;
if(fo1 != null){
      fo1.m3(ab3, ab4, fb0, fb1);
}
    ad4 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, lb0, lb1, ab1, ab2);
}
    boolean lb2 = true;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought376.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    fb1 = fd0 < fd1;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1);
}
    Thought lo1 = Thought42.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
if(fo0 != null){
      ao4 = fo0.m4();
}
    Output.points[6][0] -= fd0;
    fb0 = fb1 && fb0;
    Thought lo2 = Thought57.getInstance(fb1, fb0, fb1, fb0);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    for(int i0=0; i0<10; i0++){
if(ao1 != null){
          fo1 = ao1.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
        boolean lb3 = true;
        fd1 = fd0 + fd1;
        fb0 = fb1 && lb3;
        double ld4 = 826.8085273977078;
        boolean lb5 = true;
        lb5 = ld4 < fd0;
        fd1 *= -1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, lb3, lb5);
}
        boolean lb6 = false;
        double ld7 = 295.52953627048447;
if(ao2 != null){
          ld4 = ao2.m3(ao3, ao4, fo0, fo1);
}
        ld7 *= -1;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4);
}
    fb1 = !fb0;
    Output.points[6][1] += fd0;
    fb1 = fd1 < ad1;
    Thought lo0 = Thought126.getInstance(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
    boolean lb1 = true;
    double ld2 = 237.11060754761286;
    boolean lb3 = false;
    boolean lb4 = true;
    boolean lb5 = true;
    lb1 = !lb3;
if(ao1 != null){
      fd0 = ao1.m3();
}
    double ld6 = 842.6505895166389;
if(ao2 != null){
      ao2.m2(lb4, lb5, fb0, fb1);
}
    lb1 = !lb3;

Thought.STACK_COUNTER++;
return lb4;
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
    boolean lb0 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && lb0;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 - fd0;
    Output.points[6][2] += fd1;
        fb0 = !fb1;
    lb0 = fd0 > fd1;
    for(int i0=0; i0<10; i0++){
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}
        boolean lb1 = false;
if(ao3 != null){
          ab4 = ao3.m2(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
          ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
        fd0 = fd1 + fd0;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
        fb0 = !fb1;
        fd1 = fd0 + fd1;
        lb1 = !lb0;
if(ao4 != null){
          fd0 = ao4.m3();
}
        fd1 = fd0 - fd1;
        boolean lb2 = false;
        Output.points[6][3] += fd0;
        lb0 = fd1 < fd0;
        double ld3 = 835.6156933483851;
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    if (ab1) {
        ad2 *= -1;
        double ld0 = 933.5641066091968;
if(ao2 != null){
          ao1 = ao2.m4(ab2, ab3, ab4, fb0);
}
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
        ab4 = fd1 < ld0;
if(ao3 != null){
          ao2 = ao3.m4(ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
}
if(ao4 != null){
          ab3 = ao4.m2(fo0, fo1, ao1, ao2, ab4, fb0, fb1, ab1);
}
        ab2 = ab3 && ab4;
if(ao3 != null){
          ao3.m1(ao4, fo0, fo1, ao1);
}
        } else {
        double ld1 = 301.28667628416696;
if(ao3 != null){
          ao2 = ao3.m4(fd0, fd1, ld1, ad1);
}
        Output.points[6][4] += ad2;
        Output.points[6][5] += ad3;
        ad4 *= -1;
        boolean lb2 = true;
        ab4 = fd0 > fd1;
        ld1 = ad1 + ad2;
        fb0 = ad3 > ad4;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld1, ad1);
}
        ad2 = ad3 + ad4;
        boolean lb3 = false;
if(ao4 != null){
          fd0 = ao4.m3();
}
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd0 > fd1;
    fd0 *= -1;
        Thought lo0 = Thought397.getInstance(fb0, fb1, fb0, fb1);
    boolean lb1 = false;
    Output.points[6][6] -= fd1;
    lb1 = !fb0;
    fd0 = fd1 - fd0;
    Thought lo2 = Thought363.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb1, fb0, fb1);
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb1);
}
    fb0 = fd1 < fd0;
    double ld3 = 740.3066984952076;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb1, lb1, fb0, fb1);
}
    lb1 = !fb0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ld3 = fo1.m3(fd0, fd1, ld3, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld3, fd0, fd1, ld3);
}
        Thought lo4 = Thought309.getInstance();
    fb1 = fd0 > fd1;
    Thought lo5 = Thought122.getInstance(lb1, fb0, fb1, lb1);
    fb0 = !fb1;
    Thought lo6 = Thought50.getInstance(fo1, fo0, fo1, fo0, ld3, fd0, fd1, ld3, lb1, fb0, fb1, lb1);
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld3, fd0, fd1, fb0, fb1, lb1, fb0);
}
    fb1 = lb1 && fb0;
    ld3 *= -1;
    if (fb1) {
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
    ab1 = ab2 || ab3;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
    ab2 = fd0 < fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m1();
}
if(fo0 != null){
      ab3 = fo0.m2(ab4, fb0, fb1, ab1);
}
    boolean lb0 = false;
    ab1 = fd1 < fd0;
    double ld1 = 974.5085314023582;
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0, ab3, ab4, fb0, fb1);
}
    Thought lo2 = Thought297.getInstance(fd1, ld1, fd0, fd1, lb0, ab1, ab2, ab3);
    ab4 = ld1 > fd0;
    double ld3 = 262.9215902822336;
    fb0 = fb1 && lb0;
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    Output.points[6][7] += fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb4 = true;
    double ld5 = 400.0180506527099;
    boolean lb6 = false;
if(fo1 != null){
      ld1 = fo1.m3(ld3, ld5, fd0, fd1);
}
if(fo0 != null){
          ld1 = fo0.m3(fo1, fo0, fo1, fo0, ld3, ld5, fd0, fd1);
}
    ld1 = ld3 - ld5;
    double ld7 = 854.5845998272931;

Thought.STACK_COUNTER++;
return ld7;
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
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought45.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo1.m3(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    fb1 = ad3 < ad4;
    boolean lb1 = false;
    double ld2 = 220.24137230407015;
    ad4 *= -1;
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd0 *= -1;
    Thought lo3 = Thought1.getInstance(fd1, ld2, ad1, ad2);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    ld2 = ad1 + ad2;
    fb1 = lb1 && fb0;
    fb1 = !lb1;
    Output.points[6][8] -= ad3;
if(fo1 != null){
      fb0 = fo1.m2();
}
    Output.points[7][0] -= ad4;
if(fo0 != null){
      fo0.m3(fb1, lb1, fb0, fb1);
}
    fd0 = fd1 - ld2;
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, lb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, ld2, ad1, lb1, fb0, fb1, lb1);
}
    fb0 = !fb1;
    if (lb1) {
        Output.points[7][1] += ad2;
        fb0 = !fb1;
        Thought lo4 = Thought367.getInstance(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb1);
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
    boolean lb0 = false;
    double ld1 = 40.7045427913136;
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    Thought lo2 = Thought313.getInstance(ad1, ad2, ad3, ad4);
    boolean lb3 = false;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ad1);
}
    Thought lo4 = Thought271.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(lb3, ab1, ab2, ab3);
}
    ad2 = ad3 + ad4;
    fd0 = fd1 - ld1;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    fd1 *= -1;
    fd0 = fd1 - fd0;
    double ld0 = 613.161603916665;
    fd0 = fd1 - ld0;
    if (fb1) {
        double ld1 = 476.29093423703745;
        ld0 = fd0 + fd1;
        ld1 *= -1;
        ld0 = fd0 + fd1;
        Thought lo2 = Thought133.getInstance(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1);
}
        double ld3 = 289.68941099393874;
        ld1 = ld3 - ld0;
        fd0 *= -1;
        fb0 = fb1 && fb0;
        double ld4 = 701.9079237729646;
        fd0 = fd1 - ld1;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
    fb1 = ad4 < fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, ad1, ad2, ad3);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1);
}
if(ao3 != null){
      ad2 = ao3.m3();
}
    boolean lb0 = true;
    Thought lo1 = Thought264.getInstance(lb0, fb0, fb1, lb0);
    ad3 *= -1;
    double ld2 = 533.7408418986759;
    ad3 *= -1;
    fb0 = ad4 > fd0;
    fd1 = ld2 + ad1;
    Thought lo3 = Thought48.getInstance(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb1, lb0, fb0, fb1);
    boolean lb4 = true;

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
    if (ab1) {
        ab2 = ab3 && ab4;
        fd0 *= -1;
        fd1 *= -1;
if(ao3 != null){
          ao2 = ao3.m4(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
        Thought lo0 = Thought108.getInstance(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
if(ao2 != null){
          fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
        ab1 = fd1 > fd0;
        } else if (ab2) {
if(ao1 != null){
          ab3 = ao1.m2(fd1, fd0, fd1, fd0);
}
        ab4 = fd1 > fd0;
        fb0 = fd1 > fd0;
        fd1 *= -1;
if(ao2 != null){
          fb1 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
if(fo0 != null){
      fo0.m2(fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
    fb1 = ad4 > fd0;
    ab1 = fd1 > ad1;
    ad2 = ad3 - ad4;
if(fo1 != null){
          ab2 = fo1.m2(ao1, ao2, ao3, ao4, ab3, ab4, fb0, fb1);
}
    boolean lb0 = true;
    lb0 = ab1 && ab2;
    double ld1 = 319.60061635112754;
if(fo0 != null){
      ad4 = fo0.m3(fo1, ao1, ao2, ao3);
}
    fd0 = fd1 + ld1;
if(ao4 != null){
      ab3 = ao4.m2(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ld1, ad1);
}
    Thought lo2 = Thought350.getInstance();
    double ld3 = 230.20835857009627;
if(fo1 != null){
          fo0 = fo1.m4(ab4, fb0, fb1, lb0);
}
    boolean lb4 = true;
    lb4 = ab1 || ab2;
    boolean lb5 = true;
    ad1 = ad2 - ad3;
    double ld6 = 826.2912443849556;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > fd0;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
        fd1 = fd0 + fd1;
    fb0 = !fb1;
    Output.points[7][2] += fd0;
    fb0 = fd1 > fd0;
    fb1 = fb0 && fb1;
    Thought lo0 = Thought328.getInstance(fo1, fo0, fo1, fo0);
    fb0 = fd1 < fd0;
    boolean lb1 = false;
    for(int i0=0; i0<10; i0++){
        fb0 = !fb1;
        fd1 = fd0 - fd1;
        Thought lo2 = Thought395.getInstance(fd0, fd1, fd0, fd1);
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
          fo1.m2();
}
        fd0 *= -1;
if(fo0 != null){
          fd1 = fo0.m3(lb1, fb0, fb1, lb1);
}
        fb0 = !fb1;
        lb1 = fd0 > fd1;
        fb0 = fb1 || lb1;
        double ld3 = 652.1660417446112;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, ld3, fd0, fd1, ld3, fb0, fb1, lb1, fb0);
}
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
    Output.points[7][3] -= fd1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
    Output.points[7][4] += fd1;
    Output.points[7][5] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    double ld0 = 989.6706290244055;
    fd0 *= -1;
    fb1 = !ab1;

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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo0.m2();
}
    double ld0 = 242.53567569990983;
if(fo1 != null){
      fo1.m2(fb1, fb0, fb1, fb0);
}
    ad4 = fd0 - fd1;
    ld0 = ad1 + ad2;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(fo1 != null){
      ld0 = fo1.m3(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + ld0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    ad1 = ad2 - ad3;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ld0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fd0 = fo1.m3();
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
        fd1 = ld0 - ad1;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
        double ld1 = 519.3555047437693;
        fb1 = !fb0;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ld1, ld0, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 || fb1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    boolean lb0 = false;
    fd0 = fd1 + ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    boolean lb1 = false;
    boolean lb2 = true;
    lb0 = fd1 < ad1;
    lb1 = !lb2;
if(fo0 != null){
      ab1 = fo0.m2();
}
    ad2 = ad3 - ad4;
    ab2 = fd0 < fd1;
    boolean lb3 = false;
    Thought lo4 = Thought105.getInstance(ab2, ab3, ab4, fb0);
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, lb0, lb1, lb2);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, lb3, ab1, ab2, ab3);
}
    ab4 = ad3 < ad4;
    fd0 = fd1 + ad1;
    boolean lb5 = false;
    ab4 = ad2 > ad3;
    Output.points[7][6] -= ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought199.getInstance(ao2, ao3, ao4, fo0);
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    fb0 = !fb1;
    boolean lb1 = false;
    lb1 = fd1 > fd0;
    Output.points[7][7] += fd1;
    fd0 *= -1;
    fd1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    fb0 = !fb1;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(lb1, fb0, fb1, lb1);
}
        fb0 = fb1 || lb1;
    Output.points[7][8] += fd0;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, fb0, fb1, lb1, fb0);
}
    fb1 = fd1 > fd0;
if(fo0 != null){
      lb1 = fo0.m2(fd1, fd0, fd1, fd0, fb0, fb1, lb1, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb1, lb1, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    boolean lb2 = true;
    fd1 *= -1;
    double ld3 = 617.5973774771586;
    lb1 = lb2 && fb0;
if(fo1 != null){
      ld3 = fo1.m3(fd0, fd1, ld3, fd0);
}

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 && fb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
if(ao2 != null){
      fd0 = ao2.m3();
}
    fb0 = fb1 && fb0;
if(ao3 != null){
      ao3.m2(fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    Output.points[8][0] += ad4;
    fb1 = fb0 && fb1;
    fd0 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fb1 = ad4 < fd0;
    fd1 = ad1 - ad2;
    fb0 = fb1 && fb0;
    Thought lo0 = Thought157.getInstance(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
    fb1 = !fb0;
    boolean lb1 = true;
    fb0 = ad3 < ad4;
    Output.points[8][1] += fd0;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
    fd1 = fd0 + fd1;
    double ld0 = 548.2626249495152;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ab3 = !ab4;
if(ao2 != null){
      fb0 = ao2.m2(ld0, fd0, fd1, ld0);
}
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    Thought lo1 = Thought82.getInstance(ab1, ab2, ab3, ab4);
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ld0, fd0, fd1, fb0, fb1, ab1, ab2);
}
    boolean lb2 = true;
    ab2 = ab3 && ab4;
    fb0 = !fb1;
    Thought lo3 = Thought188.getInstance(ld0, fd0, fd1, ld0, lb2, ab1, ab2, ab3);
    ab4 = fd0 > fd1;
    ld0 *= -1;

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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    ad2 *= -1;
    ad3 = ad4 + fd0;
    fb1 = ab1 && ab2;
    fd1 = ad1 + ad2;
    Output.points[8][2] -= ad3;
if(ao1 != null){
      ad4 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ad1, ad2);
}
    ad3 *= -1;
    ad4 = fd0 - fd1;
    Output.points[8][3] += ad1;
    ad2 = ad3 + ad4;
    boolean lb0 = true;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
}
    boolean lb1 = false;
    ad3 = ad4 - fd0;

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
    boolean lb0 = false;
    fd1 = fd0 + fd1;
if(fo1 != null){
      lb0 = fo1.m2();
}
    fd0 *= -1;
    boolean lb1 = true;
if(fo0 != null){
      fd1 = fo0.m3(lb1, fb0, fb1, lb0);
}
    Thought lo2 = Thought17.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
    fd0 *= -1;
    Output.points[8][4] -= fd1;
    fd0 = fd1 + fd0;

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
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    double ld1 = 235.3651841651534;
if(fo0 != null){
      ld1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld1, fd0, fd1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1);
}
    fd0 = fd1 - ld1;
    Thought lo2 = Thought331.getInstance();
    Thought lo3 = Thought305.getInstance(fb0, fb1, lb0, fb0);
    Thought lo4 = Thought67.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, fb1, lb0, fb0, fb1);
    lb0 = fb0 && fb1;
    lb0 = fd1 > ld1;
    boolean lb5 = true;
            lb5 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld1, fd0, lb0, lb5, fb0, fb1);
}
    lb0 = fd1 < ld1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, lb5, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m1(fd0, fd1, ld1, fd0);
}
    fd1 = ld1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1);
}
    ld1 *= -1;
    double ld6 = 533.8814102048334;
    Thought lo7 = Thought243.getInstance();
    ld6 *= -1;

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
    Output.points[8][5] += fd0;
    fb1 = fd1 > fd0;
    fd1 *= -1;
    boolean lb0 = false;
if(fo1 != null){
      fo1.m2(lb0, fb0, fb1, lb0);
}
    fd0 *= -1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    fd1 *= -1;
    double ld1 = 610.1984888643967;
    boolean lb2 = false;
    boolean lb3 = false;
    lb0 = ld1 < fd0;
        Thought lo4 = Thought288.getInstance(fd1, ld1, fd0, fd1, lb2, lb3, fb0, fb1);
    Thought lo5 = Thought228.getInstance(fo1, fo0, fo1, fo0, lb0, lb2, lb3, fb0);
    fb1 = ld1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      lb0 = fo1.m2(fd1, ld1, fd0, fd1);
}
    ld1 = fd0 + fd1;

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
